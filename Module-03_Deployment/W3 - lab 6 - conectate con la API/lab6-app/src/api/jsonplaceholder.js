const BASE_URL = 'https://jsonplaceholder.typicode.com';

export async function getPosts() {
  const res = await fetch(`${BASE_URL}/posts`);
  if (!res.ok) throw new Error('Error al leer posts');
  return res.json();
}

export async function createPost(data) {
  const res = await fetch(`${BASE_URL}/posts`, {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data),
  });
  if (!res.ok) throw new Error('Error al crear post');
  return res.json(); // JSONPlaceholder devuelve el objeto con id simulado
}

export async function updatePost(id, data) {
  const res = await fetch(`${BASE_URL}/posts/${id}`, {
    method: 'PATCH', // PATCH o PUT (aquí PATCH para actualizar parcial)
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify(data),
  });
  if (!res.ok) throw new Error('Error al actualizar post');
  return res.json();
}

export async function deletePost(id) {
  const res = await fetch(`${BASE_URL}/posts/${id}`, { method: 'DELETE' });
  if (!res.ok) throw new Error('Error al borrar post');
  return true;
}
