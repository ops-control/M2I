function calculateSum() {
    const op1 = parseFloat(document.getElementById('op1').value);
    const op2 = parseFloat(document.getElementById('op2').value);
    const sum = op1 + op2;
    document.getElementById('result').innerText = 'Résultat: ' + sum;
}