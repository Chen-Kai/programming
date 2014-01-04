RFC:  
[Oauth1.0](http://tools.ietf.org/html/rfc5849)  
[Oauth2.0](http://tools.ietf.org/html/rfc6749)

[Weibo](http://open.weibo.com/)  
Oauth2.0  
<https://api.weibo.com/oauth2/access_token>  
<https://api.weibo.com/oauth2/authorize>  
<https://api.weibo.com/oauth2/get_oauth2_token>  

***

Oauth1.0
<http://api.t.sina.com.cn/oauth/request_token>  
<http://api.t.sina.com.cn/oauth/authorize>  
<http://api.t.sina.com.cn/oauth/access_token>   

    String requestTokenEndpointUrl = "http://api.t.sina.com.cn/oauth/request_token";
    String authorizationWebsiteUrl = "http://api.t.sina.com.cn/oauth/authorize";
    String accessTokenEndpointUrl = "http://api.t.sina.com.cn/oauth/access_token";
    
    String appkey = "1240744023";
    String secret = "203e51aef3a6b10e765fa6154f5eb7bb";
    String url = "https://github.com/dailyefforts";
    
    CommonsHttpOAuthProvider provider = new CommonsHttpOAuthProvider(
      	requestTokenEndpointUrl, accessTokenEndpointUrl,
    		authorizationWebsiteUrl);
    
    CommonsHttpOAuthConsumer consumer = new CommonsHttpOAuthConsumer(appkey, secret);
    String str = provider.retrieveRequestToken(consumer, url);
    System.out.println("request token: \n" + str);

