import { useEffect, useState } from 'react';
import { getPosts, createPost, updatePost, deletePost } from '../api/jsonplaceholder';
import './PostsCRUD.css';

export default function PostsCRUD() {
  const [posts, setPosts] = useState([]);
  const [loading, setLoading] = useState(true);
  const [err, setErr] = useState(null);

  // Estado para crear
  const [newTitle, setNewTitle] = useState('');
  const [newBody, setNewBody] = useState('');

  // Estado para editar
  const [editingId, setEditingId] = useState(null);
  const [editTitle, setEditTitle] = useState('');
  const [editBody, setEditBody] = useState('');

  // 1) LECTURA al montar
  useEffect(() => {
    (async () => {
      try {
        setLoading(true);
        setErr(null);
        const data = await getPosts();
        setPosts(data.slice(0, 10)); // para no saturar la vista (opcional)
      } catch (e) {
        setErr(e.message || 'Error desconocido');
      } finally {
        setLoading(false);
      }
    })();
  }, []);

  // 2) CREAR con botón
  const handleCreate = async () => {
    if (!newTitle.trim() || !newBody.trim()) return alert('Completa título y cuerpo');
    try {
      const created = await createPost({
        title: newTitle,
        body: newBody,
        userId: 1,
      });
      // JSONPlaceholder no persiste, pero devolvemos lo creado con id simulado
      setPosts((prev) => [{ ...created }, ...prev]);
      setNewTitle('');
      setNewBody('');
    } catch (e) {
      alert(e.message || 'No se pudo crear');
    }
  };

  // 3) Preparar edición
  const startEdit = (p) => {
    setEditingId(p.id);
    setEditTitle(p.title);
    setEditBody(p.body);
  };

  const cancelEdit = () => {
    setEditingId(null);
    setEditTitle('');
    setEditBody('');
  };

  // 3) ACTUALIZAR con botón
  const handleUpdate = async (id) => {
    if (!editTitle.trim() || !editBody.trim()) return alert('Completa título y cuerpo');
    try {
      const updated = await updatePost(id, { title: editTitle, body: editBody });
      setPosts((prev) =>
        prev.map((p) => (p.id === id ? { ...p, ...updated } : p))
      );
      cancelEdit();
    } catch (e) {
      alert(e.message || 'No se pudo actualizar');
    }
  };

  // 4) BORRAR con confirmación
  const handleDelete = async (id) => {
    const ok = confirm('¿Seguro que quieres borrar este post?');
    if (!ok) return;
    try {
      await deletePost(id);
      setPosts((prev) => prev.filter((p) => p.id !== id));
    } catch (e) {
      alert(e.message || 'No se pudo borrar');
    }
  };

  if (loading) return <p className="muted">Cargando posts…</p>;
  if (err) return <p className="error">Error: {err}</p>;

  return (
    <section className="posts">
      <h2>CRUD de Posts (JSONPlaceholder)</h2>

      {/* Crear */}
      <div className="card new">
        <h3>Crear nuevo post</h3>
        <div className="field">
          <label>Título</label>
          <input
            value={newTitle}
            onChange={(e) => setNewTitle(e.target.value)}
            placeholder="Título del post"
          />
        </div>
        <div className="field">
          <label>Cuerpo</label>
          <textarea
            value={newBody}
            onChange={(e) => setNewBody(e.target.value)}
            placeholder="Contenido…"
            rows={3}
          />
        </div>
        <button onClick={handleCreate}>Crear</button>
      </div>

      {/* Listado */}
      <ul className="list">
        {posts.map((p) => (
          <li key={p.id} className="card">
            {editingId === p.id ? (
              <>
                <div className="field">
                  <label>Título</label>
                  <input
                    value={editTitle}
                    onChange={(e) => setEditTitle(e.target.value)}
                  />
                </div>
                <div className="field">
                  <label>Cuerpo</label>
                  <textarea
                    value={editBody}
                    onChange={(e) => setEditBody(e.target.value)}
                    rows={3}
                  />
                </div>
                <div className="row">
                  <button onClick={() => handleUpdate(p.id)}>Actualizar</button>
                  <button className="ghost" onClick={cancelEdit}>Cancelar</button>
                </div>
              </>
            ) : (
              <>
                <h4 className="title">{p.title}</h4>
                <p className="body">{p.body}</p>
                <div className="row">
                  <button onClick={() => startEdit(p)}>Actualizar</button>
                  <button className="danger" onClick={() => handleDelete(p.id)}>Borrar</button>
                </div>
              </>
            )}
          </li>
        ))}
      </ul>
    </section>
  );
}
