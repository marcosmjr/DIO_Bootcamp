import { CourseServise } from './course.servise';
import { Component, OnInit } from "@angular/core";
import { Course } from "./course";

@Component({
   // selector: 'app-course-list', 
   // retirado porque estamos usando rotas para linkar os comonentes
    templateUrl: './course-list.component.html'
})

export class CourseListComponent implements OnInit{
    
    filteredCourses: Course[] = [];

    _courses: Course[] = [];
 
    _filterBy: string = "";

    constructor(private courseServise: CourseServise){

    }

    ngOnInit(): void {
        this._courses = this.courseServise.retriveAll();
        this.filteredCourses = this._courses;
    }

    set filter(valor: string){
        this._filterBy = valor;

        this.filteredCourses = this._courses.filter((course: Course) => 
        course.name.toLowerCase().indexOf(this._filterBy.toLowerCase()) > -1)
    }

    get filter(){
        return this._filterBy;
    }
}