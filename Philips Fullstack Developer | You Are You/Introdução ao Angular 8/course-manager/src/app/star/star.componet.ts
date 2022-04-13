import { Component, Input, OnChanges, SimpleChanges } from "@angular/core";

@Component({
    selector: 'app-star',
    templateUrl: './star.componet.html',
    styleUrls: ['./star.componet.css']
    
})


export class StarComponet implements OnChanges{

    @Input()
    rating: number = 0;

    starWidth: number = 0;

    ngOnChanges(): void {
        this.starWidth = this.rating * 74/5; /* 74 / 5 = 14.8*/
        
    }
}