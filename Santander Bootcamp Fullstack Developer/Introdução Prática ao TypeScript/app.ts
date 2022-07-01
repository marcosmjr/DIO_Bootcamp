let botao = document.getElementById('convert');
let celcius = document.getElementById('inC') as HTMLInputElement;
let retornoKelvin: number = 0;
const ZERO_CELCIUS_KELVIN = 273.15;


function celciusKelvin(valor: number): number{
    if(Number(celcius.value) < -ZERO_CELCIUS_KELVIN){
        celcius.value = "";
        alert("Não existe valor para temperatura menor que -273,15 C°");
        return 0;
    }
    
    if(celcius.value == ""){
        alert("Digite um valor para a temperatura");
        return 0;
    }

    return valor + ZERO_CELCIUS_KELVIN;
}

if(botao){
    botao.addEventListener('click', ()=>{
        retornoKelvin = celciusKelvin(Number(celcius.value));
        document.getElementById('outK')?.setAttribute('value', String(retornoKelvin.toFixed(2)))  
        console.log(retornoKelvin.toFixed(2))
    });
}




