document.addEventListener('DOMContentLoaded', () => {
    const button = document.getElementById('randomButton');

    button.addEventListener('mouseover', () => {
        const x = Math.random() * (window.innerWidth - button.offsetWidth);
        const y = Math.random() * (window.innerHeight - button.offsetHeight);
        button.style.left = `${x}px`;
        button.style.top = `${y}px`;
    });
});