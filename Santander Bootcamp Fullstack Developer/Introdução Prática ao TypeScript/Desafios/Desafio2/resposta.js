"use strict";
var Profissao;
(function (Profissao) {
    Profissao[Profissao["Padeiro"] = 0] = "Padeiro";
    Profissao[Profissao["Atriz"] = 1] = "Atriz";
})(Profissao || (Profissao = {}));
//Resposta 1
class Pessoa {
}
let pessoa1 = new Pessoa;
let pessoa2 = new Pessoa;
let pessoa3 = new Pessoa;
let pessoa4 = new Pessoa;
pessoa1.nome = 'maria';
pessoa1.idade = 29;
pessoa1.profissao = Profissao.Padeiro;
pessoa2.nome = 'Roberto';
pessoa2.idade = 19;
pessoa2.profissao = Profissao.Padeiro;
pessoa3.nome = 'Laura';
pessoa3.idade = 32;
pessoa3.profissao = Profissao.Atriz;
pessoa4.nome = 'Carlos';
pessoa4.idade = 19;
pessoa4.profissao = Profissao.Padeiro;
//Resposta 2
let pessoa11 = {
    nome: 'maria',
    idade: 19,
    profissao: Profissao.Padeiro,
};
let pessoa21 = {
    nome: 'Roberto',
    idade: 19,
    profissao: Profissao.Padeiro,
};
let pessoa31 = {
    nome: 'Laura',
    idade: 32,
    profissao: Profissao.Atriz,
};
let pessoa41 = {
    nome: 'Calos',
    idade: 19,
    profissao: Profissao.Padeiro,
};
//Resposta 3
let pessoa12 = {
    nome: 'maria',
    idade: 19,
    profissao: Profissao.Padeiro
};
let pessoa22 = {
    nome: 'Roberto',
    idade: 19,
    profissao: Profissao.Padeiro
};
let pessoa32 = {
    nome: 'Laura',
    idade: 32,
    profissao: Profissao.Atriz
};
let pessoa42 = {
    nome: 'Carlos',
    idade: 19,
    profissao: Profissao.Padeiro
};
