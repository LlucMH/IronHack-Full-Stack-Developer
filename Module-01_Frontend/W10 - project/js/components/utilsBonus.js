export function getSelectedUUIDBonus() {
  const params = new URLSearchParams(window.location.search);
  return params.get("uuid") || "1";
}
