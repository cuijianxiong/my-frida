Java.perform(function() {                

    var array_list = Java.use("java.util.ArrayList");
    var ApiClient = Java.use('com.android.org.conscrypt.TrustManagerImpl');
	
	var util5 = Java.use("com.androidplus.util.Md5Util");
	
	util5.md5.implementation = function(arg1){
		console.log("md5");
		console.log(arg1);
		return;
	}
	
    ApiClient.checkTrustedRecursive.implementation = function(a1,a2,a3,a4,a5,a6) {
            console.log('Bypassing SSL Pinning');
            var k = array_list.$new(); 
            return k;
    }

	
},0);



