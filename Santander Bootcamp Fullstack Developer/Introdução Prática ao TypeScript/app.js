"use strict";
let botao = document.getElementById('convert');
let celcius = document.getElementById('inC');
let retornoKelvin = 0;
const ZERO_CELCIUS_KELVIN = 273.15;
function celciusKelvin(valor) {
    if (Number(celcius.value) < -ZERO_CELCIUS_KELVIN) {
        celcius.value = "";
        alert("Não existe valor para temperatura menor que -273,15 C°");
        return 0;
    }
    if (celcius.value == "") {
        alert("Digite um valor para a temperatura");
        return 0;
    }
    return valor + ZERO_CELCIUS_KELVIN;
}
if (botao) {
    botao.addEventListener('click', () => {
        var _a;
        retornoKelvin = celciusKelvin(Number(celcius.value));
        (_a = document.getElementById('outK')) === null || _a === void 0 ? void 0 : _a.setAttribute('value', String(retornoKelvin.toFixed(2)));
        console.log(retornoKelvin.toFixed(2));
    });
}
