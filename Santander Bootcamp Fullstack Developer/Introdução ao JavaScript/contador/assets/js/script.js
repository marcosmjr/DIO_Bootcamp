let contador = 0;
var currentNumber = document.getElementById('currentNumber');

let contador1 = 0;
const currentNumber1 = document.getElementById('currentNumber1');

let contador3 = 0;
const currentNumber3 = document.getElementById('currentNumber3');

let contador4 = 0;
const currentNumber4 = document.getElementById('currentNumber4');


function increment() {
    contador = contador + 1;
    currentNumber.innerHTML = contador;
}


function decrement() {
    contador = contador - 1;
    currentNumber.innerHTML = contador;
}



function incrementMaximo10() {
    if(contador1 < 10){
        contador1++;
        currentNumber1.innerHTML = contador1;
        
    }
    if(contador1 >= 0){
        currentNumber1.style.color = 'black';
    }
}

function decrementNaoNegativo() {
    contador1--;
    currentNumber1.innerHTML = contador1;
    if(contador1 < 0){
        currentNumber1.style.color = 'red';
    }
}


function incrementMaximo10a() {
    if(contador3 < 10){
        contador3++;
        currentNumber3.innerHTML=contador3;  
    }
}

function decrementMinimo0() {
    if(contador3 > 0){
        contador3--;
        currentNumber3.innerHTML = contador3;  
    }
}


function load(){
    var elemento1 = document.getElementById("adicionar");
    var elemento2 = document.getElementById("subtrair");
    elemento1.addEventListener("click", function(){incrementMaximo10b()})
    elemento2.addEventListener("click", function(){decrementMinimob()})
}

function incrementMaximo10b() {
        contador4++;
        currentNumber4.innerHTML=contador4;  
}

function decrementMinimob() {
        contador4--;
        currentNumber4.innerHTML = contador4;  
    
}