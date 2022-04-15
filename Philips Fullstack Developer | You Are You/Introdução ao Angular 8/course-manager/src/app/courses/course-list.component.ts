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
        this.retriveAll();
    }

    retriveAll(): void{
        this.courseServise.retriveAll().subscribe({
            next: courses => {
                this._courses = courses;
                this.filteredCourses = this._courses;
            },
            error: err => console.log('Error ', err)
        });
        this.filteredCourses = this._courses;
    }

    deleteById(couseId: number): void{
        this.courseServise.deleteById(couseId).subscribe({
            next: () => {
                console.log('Deleted with success');
                this.retriveAll();
            },
            error: err => console.log('Error ', err)
        })
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