##Chapter 1. Fundamentals
###1.1. Request execution
The most essential function of HttpClient is to execute HTTP methods. Execution of an HTTP method involves one or several HTTP request / HTTP response exchanges, usually handled internally by HttpClient. The user is expected to provide a request object to execute and HttpClient is expected to transmit the request to the target server return a corresponding response object, or throw an exception if execution was unsuccessful.

HttpClient����Ҫ��������ִ�и���HTTP������ִ��һ��HTTP����������Ҫ����һ�λ򼸴�HTTP request��HTTP response��������Щ��������ͨ����HttpClient�ڲ�������ɡ����ǵù���һ��request���󽻸�HttpClientִ�У�HttpClient�ͻ�����request����ͨ�����紫�ݸ�Ŀ��������������ظ�����һ����Ӧ��response��������쳣��

Quite naturally, the main entry point of the HttpClient API is the HttpClient interface that defines the contract described above.

����Ȼ�أ�HttpClient API���������Ƕ������������̵�HttpClient�ӿڡ�

Here is an example of request execution process in its simplest form:

������һ����򵥵�����ִ�й��̵�ʵ����
HttpClient httpclient = new DefaultHttpClient();
HttpGet httpget = new HttpGet("http://localhost/");
HttpResponse response = httpclient.execute(httpget);
HttpEntity entity = response.getEntity();
if (entity != null) {
	InputStream instream = entity.getContent();
	try {
		// do something useful
	} finally {
		instream.close();
	}
}
1.1.1.HTTP request
All HTTP requests have a request line consisting a method name, a request URI and an HTTP protocol version.

���е�HTTP������һ��request�У����а���һ����������һ��request URI��һ��HTTPЭ��汾�š�

HttpClient supports out of the box all HTTP methods defined in the HTTP/1.1 specification: GET, HEAD, POST, PUT, DELETE, TRACE and OPTIONS. There is a specific class for each method type.: HttpGet, HttpHead, HttpPost, HttpPut, HttpDelete, HttpTrace, and HttpOptions.

HttpClient֧��HTTP/1.1�淶�ж��������HTTP������GET, HEAD, PUT, DELETE, TRACE and OPTIONS. �������ÿһ��������һ���ض����ࣺHttpGet, HttpHead, HttpPost, HttpPut, HttpDelete, HttpTrace, and HttpOptions.

The Request-URI is a Uniform Resource Identifier that identifies the resource upon which to apply the request. HTTP request URIs consist of a protocol scheme, host name, optional port, resource path, optional query, and optional fragment.

Request-URI��һ��ͳһ��Դ��λ��ʶ��������Э�鷽�������������˿ںţ���ѡ������Դ·������ѯ��Ϣ����ѡ����Ƭ�Σ���ѡ����ɡ�


