// tipos de função 

// declarativas
function funcao(){
    console.log('Sou uma menssagem de uma função declarativa');
}

funcao();

// expressão de função
// com nomeação
var funcaoExpressao  = function funcaoExpressao(){ // os nomes da variável e da função não precisão ser necessariamente iguais
    console.log('Sou uma menssagem de uma função de expressão');
}

funcaoExpressao();

// sem nomeação
var funcaoExpressaoSemNome  = function(){
    console.log('Sou uma menssagem de uma função de expressão sem nome de função');
}

funcaoExpressaoSemNome();

// Arrow Function - São funções de expressão de sintaxe curta. 
//São sempre anônima, e portanto não podem ser nomeadas.

var arrowFunction = () => { 
    console.log('Sou uma arrow function');
}
    

arrowFunction();
