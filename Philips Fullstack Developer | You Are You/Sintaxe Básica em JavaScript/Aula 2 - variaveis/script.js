// tipos primitivos

//boolean
var vOuf = false;
console.log(vOuf);
console.log(typeof(vOuf))

//number
var numeroQualquer = 1;
console.log(numeroQualquer);
console.log(typeof(numeroQualquer));

//string
var nome = "Marcos";
console.log(nome);
console.log(typeof(nome));

nome = "Moreira";
console.log(nome);
nome = 10;
console.log(nome);

// let é usado em escopo local

let variavel2 = 'Cristiana';
console.log(variavel2);
variavel2 = "Faria";
// variavel = 1; variáveis do let, não permite a mudança de tipo depois de inicializadas com um tipo.
console.log(variavel2);
//let variavel3;  se não inicalizada a variável é dita não definida (undefined)
//console.log(variavel3);

const variavel4 = 'Naruto'; // Esta definica como constante, seu valor nãopo de ser mais alterado;

var escopoGlobal = 'global';
console.log(escopoGlobal);

function escopoLocal(){
    let escoloLocalInterno = 'local';
    console.log(escoloLocalInterno);
}

//atribuição
var atribuicao = 'Marcos';

//comparação
console.log('comparação ==')

var comparacao = 0 == 0;
console.log(comparacao);

var comparacao1 = '0' == 0;
console.log(comparacao1);

var comparacao2 = '' == 0;
console.log(comparacao2);

//comparação identica
console.log('comparação identica ===')

var comparacao3 = 0 === 0;
console.log(comparacao3);

var comparacao4 = '0' === 0;
console.log(comparacao4);

var comparacao5 = '' === 0;
console.log(comparacao5);



