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
        this.course = this.courseServise.retriveById(+this.activatedRoute.snapshot.paramMap.get('id')!);  
        // ! diz para o compilador não se preocupar com o null
    }

    save(): void{
        this.courseServise.save(this.course);
    }
}