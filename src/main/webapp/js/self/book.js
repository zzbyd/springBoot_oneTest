/**
 *zzb to 2021-03-14 
 */


  var app = new Vue({
	   el:'#app',
	   data:{
		   book:null,
		   bookname:'',
		   booknumber:''
	   },
	   methods:{
		   queryduring:function(){
			 obj.queryDuring(this.bookname,this.booknumber);
		   },
		   update:function(){
			   
		   },
		   add:function(){
			   
		   },
		   deletes:function(){
			   
		   }
	   }
  });

  
  var obj = $.extend({},{
	  query:function(){
		var bookList =null 
		 $.get(
			 '/book/queryAllBook',
			{}
		  ).done(function(resp){
			 app.$data.book = resp;
		  });
		  
	  },
	  
	  queryDuring:function(bookname,booknumber){
		  $.ajax({
			  url:'/book/queryDuringBook',
			  type:'post',
			  data:JSON.stringify({"name":bookname,"number":booknumber}),
			  contentType: 'application/json'
		  }).done(function(resp){
			  app.$data.book = resp;
		  })
	  }
  });
  
  obj.query();
  