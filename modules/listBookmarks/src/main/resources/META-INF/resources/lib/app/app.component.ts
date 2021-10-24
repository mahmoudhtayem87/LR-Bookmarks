import {Component, OnInit} from '@angular/core';

declare const Liferay: any;

@Component({
	template: `<div *ngFor="let bookmark of bookmarks" class="row">
		<div class="col-10">
			{{bookmark.title}}
		</div>
		<div class="col-2">
			<button class="btn btn-danger" (click)="deleteBookmark(bookmark.bookmarkId)">
				Delete
			</button>
		</div>
	</div>`,
})
export class AppComponent  implements OnInit{
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
	public bookmarks:Array<any> = [];

	async deleteBookmark(bookmarkId:number)
	{
		var serviceUrl = "/bookmark.bookmark/remove-bookmark-by-id";
		var object =
			{
				bookmarkId:bookmarkId
			};
		var prom = this.generateServicePromise(serviceUrl, object);
		await prom;
		this.getBookmark();
	}
	async getBookmark()
	{
		var serviceUrl = "/bookmark.bookmark/get-bookmarks-for-current-user";
		var prom = this.generateServicePromise(serviceUrl, {});
		this.bookmarks = await prom;
	}

	ngOnInit(): void {
		this.getBookmark();
	}
}