
let parametro1 = 0;
let parametro2 = 0;
let n = 0;
let n1 = 0;
let n2 = 0;
let saida = '';

n = paramentros();

n1 = n[0];
n2 = n[1];

comparaNumerosIguais();

if(soma() > 10 && soma() < 20){

    saida = `Os numeros ${n1} e ${n2} são ${comparaNumerosIguais()}. Sua soma é ${soma()}, que é maior que 10 e menor que 20.`
    console.log(saida);

}else if(soma() < 10){

    saida = `Os numeros ${n1} e ${n2} são ${comparaNumerosIguais()}. Sua soma é ${soma()}, que é menor que 10 e menor que 20.`
    console.log(saida);

}else if(soma() > 20){

    saida = `Os numeros ${n1} e ${n2} são ${comparaNumerosIguais()}. Sua soma é ${soma()}, que é maior que 10 e maior que 20.`
    console.log(saida);

}else if(soma() == 10){

    saida = `Os numeros ${n1} e ${n2} são ${comparaNumerosIguais()}. Sua soma é ${soma()}, que é igual que 10 e menor que 20.`
    console.log(saida);
    
}else if(soma() == 20){

    saida = `Os numeros ${n1} e ${n2} são ${comparaNumerosIguais()}. Sua soma é ${soma()}, que é maior que 10 e igual que 20.`
    console.log(saida);
}
 

function paramentros(){
    parametro1 = Number(prompt("Digite o primeiro número: "));
    parametro2 = Number(prompt("Digite o segundo número: "));

    if(!parametro1 || !parametro2){ 
        alert('Defina dois números');
        paramentros();
    }

    let param = [parametro1, parametro2]
    return param;
}

 function soma(){
     return n1 + n2;
 }

 function comparaNumerosIguais(){
    let igualdade = "";
    n1 == n2 ? igualdade = "iguais" : igualdade = "diferentes";
    return igualdade;
 }

