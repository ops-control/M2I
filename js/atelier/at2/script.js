function displayNote() {
    const title = document.getElementById('title').value;
    const content = document.getElementById('content').value;
    const color = document.getElementById('color').value;

    const noteDisplay = document.getElementById('noteDisplay');
    const note = document.createElement('div');
    note.className = 'note';
    note.style.backgroundColor = color;
    note.innerHTML = `<h2>${title}</h2><p>${content}</p>`;

    noteDisplay.appendChild(note);
}