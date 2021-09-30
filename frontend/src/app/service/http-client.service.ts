import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

export class product
{
  constructor(
    public productId: string,
    public name: string,
    public code: string,
    public title: string,
    public description: string,
    public imgUrl: string,
    public price: string,

    ){}

}

@Injectable({
  providedIn: 'root'
})
export class HttpClientService {

  constructor(private httpClient: HttpClient) { }

  getProducts(){
    console.log("test call");
    return this.httpClient.get<product[]>('http://localhost:8080/products');

  }

}
