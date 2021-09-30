import { Component, OnInit } from '@angular/core';
import { HttpClientService, product } from '../service/http-client.service';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  products : product[] | undefined;

  constructor(private httpClientService : HttpClientService) { }

  ngOnInit(): void {
    this.httpClientService.getProducts().subscribe(responce =>{

      this.handleSuccessfulResponse(responce);
    }

    )
  }
  handleSuccessfulResponse(responce: product[]): void {
    this.products = responce;
    throw new Error('Method not implemented.');
  }

}
