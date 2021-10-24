import { Component } from '@angular/core';
declare const Liferay: any;

@Component({
	template: `<button class="btn btn-primary" (click)="addToBookmarks()">Add To Bookmarks</button>`,
})
export class AppComponent {
	currentURL()
	{
		return Liferay.ThemeDisplay.getLayoutURL();
	}
	getRelativeURL()
	{
		return Liferay.ThemeDisplay.getLayoutRelativeURL();
	}
	generateServicePromise(serviceURL:string,serviceObject:any):Promise<any>
	{
		const prom = new Promise((resolve,reject)=>{
			Liferay.Service(serviceURL,serviceObject,(result:any)=>{
				resolve(result);
			},(error:any)=>{
				reject(error);
			});
		});
		return  prom;
	}
	getGroupId()
	{
		return Liferay.ThemeDisplay.getScopeGroupId();
	}
	async addToBookmarks()
	{
		var serviceUrl = "/bookmark.bookmark/add-bookmark";
		var object = {
			groupId:this.getGroupId() ,
			title: this.getRelativeURL(),
			description: '',
			url: this.currentURL()
		}
		var prom = this.generateServicePromise(serviceUrl,object);
		var toBeAdded = await prom;
	}
}