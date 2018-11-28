Java.perform(function() {                

    var test1 = Java.use("java.util.HashMap");
    var ApiClient = Java.use('com.android.org.conscrypt.TrustManagerImpl');

	test1.implementation = function(arg1,arg2){
		java.util.HashMap(arg1,arg2);
		console.log(arg1);
		console.log(arg2);
	}
},0);