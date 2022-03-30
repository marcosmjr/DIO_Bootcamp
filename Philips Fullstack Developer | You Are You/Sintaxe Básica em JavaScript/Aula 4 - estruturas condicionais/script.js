var jogador1 = 0;
var jogador2 = 0;
var placar;

//condiçção ternária
jogador1 != -1 && jogador2 != -1 ? jogo() : console.log("Os jogadores são inválidos");

   
function jogo(){
    console.log("Os jogadores são válidos")
    if(jogador1 > 0  && jogador2 == 0){
        console.log("Jogador 1 marcou um ponto!");
        placar = jogador1 > jogador2;
    }else if(jogador2 > 0 && jogador1 == 0){
        console.log("Jogador 2 marcou um ponto!");
        placar = jogador2 > jogador1;
    }else{
        console.log('Niguém marcou ponto!')
    }
}

switch(placar){
    case placar == jogador1 > jogador2:
    console.log("O Jogador 1 ganhou");
    break;

    case placar == jogador2 > jogador1:
    console.log("O Jogador 2 ganhou");
    break;

    default:
        console.log("Ninguem Ganhou");
}
    let array = ['valor1', 'valor2', 'valor3', 'valor4', 'valor5'];
    let object = {propriedade1: 'valor1', propriedade2: 'valor2', propriedade3: 'valor3'};

    //for - executa uma instrução ate que ela seja falsa
    console.log('for ************************************');

    for(let indice = 0; indice < array.length; indice++){
        console.log(indice)
    }

    //for/in - executa repetição a partir de uma propriedade
    console.log('for/in *********************************');
    for(let i in array){
        console.log(i);
    }

    //for/in com object
    console.log('for/in com object **********************');

    for(let i in object){ //poderiamos usar so o i porque o js ira entender que i e uma variavel de estado pois ja foi declarado antes
        console.log(i);
    }

    //for/of 
    console.log('for/of *********************************');

    for(let i of array){ 
        console.log(i);
    }

     //for/of com object
    console.log('for/of com object **********************');

     for(let i of object.propriedade1){ 
         console.log(i);
     }

     //while executa auma instrução "enaquanto" determinada condição for verdadeira
     console.log('while *********************************');

     var a = 0;
     while( a < 10 ){
         a++;
         console.log(a);
     }

     //do/while executa auma instrução "até que" determinada condição seja falsa
     console.log('do/while ******************************');

     var b = 0;
     do{
         b++;
         console.log(b);
     }while( b < 10 );

