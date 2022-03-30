
let n1;
let n2;
let resultado;
let operacao = "";
let opcao = '';

function calculadora(){
    operacao = prompt("Escolha uma operação:\n 1 - Soma(+)\n 2 - Subitração (-)\n 3 - Multiplicação (*)\n 4 - Divisão real (/)\n 5 - Divisão inteira (%)\n 6 - Potenciação (**)");
}

calculadora();

entrada();

escolha();

function escolha(){
    switch(operacao){
        case "1":
            soma();
            break;
        case "2":
            subitracao();
            break;
        case "3":
            multiplicacao();
            break;
        case "4":
            divisaoReal();
            break;
        case '5':
            divisaoInteira();
            break;
        case "6":
            potenciacao();
            break;
        default:
            alert("Opção inválida tente novamente");
            calculadora();
    }
}

novaOperação();

function entrada(){
    n1 = Number(prompt('Isira o primeiro valor: '));
    n2 = Number(prompt('Isira o segundo valor: '));
}


function soma(){
    resultado = n1 + n2;
    alert(`${n1} + ${n2} = ${resultado}`);
}

function subitracao(){
    resultado = n1 - n2;
    alert(`${n1} - ${n2} = ${resultado}`);
}

function multiplicacao(){
    resultado = n1 * n2;
    alert(`${n1} * ${n2} = ${resultado}`);
}

function divisaoReal(){
    resultado = n1 / n2;
    alert(`${n1} / ${n2} = ${resultado}`);
}

function divisaoInteira(){
    resultado = n1 % n2;
    alert(`O resto da divisão entre ${n1} e ${n2} é igual a ${resultado}`);
}

function potenciacao(){
    resultado = n1 ** n2;
    alert(`${n1} elevado a ${n2} é igual a ${resultado}`);
}

function novaOperação(){
    opcao = prompt('deseja fazer outra operação?\n 1 - Sim\n 2 - Não')

    if(opcao == 1){
        opcao = "";
        calculadora();
        entrada();
        escolha()
        novaOperação();
    }else if (opcao == 2) {
        alert('Atá mais');
    } else {
        alert("Digite uma opção válida!");
        novaOperação();
       
    }
}




