// Como funcionam as interfaces
// Como funcionam os types

/*interface IAnimal{
    nome: string;
    tipo: 'terrestre' | 'aquatico';
    domestico: boolean;
}

interface IFelino extends IAnimal{
    visaoNoturna: boolean;
}

interface ICanino extends IAnimal{
    porte: 'pequeno' | 'medio' | 'grande'
}

type IDomestico = IFelino | ICanino;



const animal: IDomestico = {
    domestico: false,
    nome: 'cachorro',
    porte: 'medio',
    tipo: 'terrestre',
   
}*/


//Tratando a tag input
//****** Lê elementos no HTML ********

/*const input = document.getElementById('input') as HTMLInputElement; 
// escrever HTMLInputElement mas tarde tirando 
// as HTMLInputElement; e escrevendo
//input: HTMLInputElement; em outra linha

input.addEventListener('input', (event)=>{
    const i = event.currentTarget as HTMLInputElement;
    console.log(i.value)
});*/

//O que são Generic types
// Generic Types

/*function adicinarApendiceALista<T>(array: any[], valor: T){
    return array.map(item => item + valor);
}

adicinarApendiceALista([1, 2, 3], 'q');*/

//Desenvolvendo condicionais a partir de parâmetros

/*interface IUsuario {
    id: string;
    email: string;
}

interface IAdmin extends IUsuario{
    cargo:  'gerente' | 'coodenador' | 'supervisor';
}

function redirecione(usuario: IUsuario | IAdmin){
    if('cargo' in usuario){
        //redirecionar para área de administração
    }

    //redirecionar para área do usuário
}*/

//Utilizando o caracter "?" para variáveis opcionais
/*interface IUsuario {
    id: string;
    email: string;
    cargo?:  'gerente' | 'coodenador' | 'supervisor' |  'funcionario';
}


function redirecione(usuario: IUsuario){
    if(usuario.cargo){
        //redirecionar(usuario.cargo)
    }

    //redirecionar para área do usuário
}*/

//Criando variáveis com propriedade readonly e private
/*interface Cachorro{
    nome: string;
    idade: number;
    parqueFavorito?: string;
}

type  CachorroSomenteLeitura = {
    +readonly [ K in keyof Cachorro]-?: Cachorro[K];
}

class MeuCachorro implements CachorroSomenteLeitura{
     idade;
     nome;
     parqueFavorito;

    constructor(nome, idade){
        this.nome = nome;
        this.idade = idade;
    }
}

const cao = new MeuCachorro('Apolo', 14);
cao.idade = 8;

console.log(cao)*/


//Como importar bibliotecas com typescript

/*import $ from "jquery";

$.fn.extend({
    novaFuncao(){
        console.log('Chamou nova função');
    }

});

$('body').novaFuncao();*/

/***********************************/

export const numero = 2;

/***********************************/

/*interface Pessoa{
    nome: string;
    idade: number;
    nacionalidade: string;
}

// utility types
interface Brasileiro extends Omit<Pessoa, 'nacionalidade'>{

}

const brasileiro: Brasileiro = {
    
}*/