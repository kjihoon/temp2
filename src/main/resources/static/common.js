/**
 * 
 * DashBoard Common javascript
 * Last updated: 2019.02.06
 * made by kwak ji hoon
 */



	function callRest(url){
			var result;
			$.ajax({
			    url: url,
				async: false,
				dataType: "json",
				success: function(data){
					result = data;
				}
			 	,beforeSend:function(){
			 		
			    }
			    ,complete:function(){
			    	
			    }
			})
			return result;
	}
	function submitForm(url,data){
		var result;
		$.ajax({
		    url: url,
		    data: data,               
		    type: "GET",
		    dataType: "json",
			async: false,
			success: function(data){
				result = data;
			}
		})
		return result;
	}
	function resetTable(){
		
		var dom = `<tr v-for="row in rows">
					<td data-toggle="modal" data-target="#goDetail">{{row.bookidx}}</td>
			   	 	<td data-toggle="modal" data-target="#goDetail">{{row.customer_name}}</td>
			   	 	<td data-toggle="modal" data-target="#goDetail">{{row.customer_addr}}</td>
			   	 	<td data-toggle="modal" data-target="#goDetail">{{row.out_date}}</td>
			    	<td data-toggle="modal" data-target="#goDetail">{{row.price}}</td>
			  	</tr>`
		$("#mainTable").html(dom);
	}
	function search(){
		var searchQry = $("#searchQry").val();
		resetTable();
	
		new Vue({
            el: '#mainTable',
            data: function(){
                return {rows: null};
            },
            created: function(){
                this.fetchData();
            },
            methods: {
            	fetchData: function() {
                    this.rows = callRest("/main/"+searchQry);
                }
            }
        });
	}

		
		
	
	
	$(document).ready(function(){
		
		new Vue({
		  el: '#mainTable',
		  data: {rows: callRest("/main/test")}
		})
		$("#searchSubmit").click(function(){
			search();
		})
		$("#searchSubmit").mouseup(function(){
			$(this).addClass("active")
		})
		
	})

	
	