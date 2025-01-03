const countries = ["France", "Japon", "Togo", "Suède", "Brésil"];
const ul = document.getElementById('country-list');

countries.forEach(country => {
    const li = document.createElement('li');
    li.textContent = country;
    ul.appendChild(li);
});