import { CourseServise } from './course.servise';
import { Component, OnInit } from "@angular/core";
import { ActivatedRoute } from "@angular/router";
import { Course } from "./course";

@Component({
    templateUrl: './course-info.component.html'
})

export class CourseInfoComponent implements OnInit{

    course: Course = new Course; /********/
    

    constructor(private activatedRoute: ActivatedRoute, private courseServise: CourseServise){ }

    ngOnInit(): void { 
        this.courseServise.retriveById(+this.activatedRoute.snapshot.paramMap.get('id')!).subscribe({  // ! diz para o compilador não se preocupar com o null
            next: course => this.course = course,
            error: err => console.log('Erro ', err)
        });  
       
    }

    save(): void{
        this.courseServise.save(this.course).subscribe({
            next: course => console.log('Save with success ', course),
            error: err => console.log('Erro ', err)
        });
    }
}