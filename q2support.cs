public ActionResult CreateCharge(string token) {
/*
* Accepts token id (eg. tok_xxx) and creates charge using the Stripe API.
* https://stripe.com/docs/api#create_charge
*/
// Get the Stripe Secret API Key from Configuration File. (eg. sk_test_W8xJYzw56NCHun0FT9iGIJeI)
string clientSecretKey = ConfigurationManager.AppSettings["ClientSecretKey"];
const string ChargeUrl = "https://api.stripe.com/v1/charges?amount={0}&currency={1}&source={2}&description={3}";
string requestUrl = HttpUtility.UrlPathEncode(
String.Format(ChargeUrl, 1000, "usd", "tok_19xLu8HN9aKw9vrkUsflNWOI", "Test charge to text@example.com")
);
HttpWebRequest request = WebRequest.Create(requestUrl) as HttpWebRequest;
request.Headers.Add("Authorization", "sk_test_W8xJYzw56NCHun0FT9iGIJeI");
request.ContentType = "application/x-www-form-urlencoded";
request.Method = "POST";
dynamic response;
using (HttpWebResponse httpResponse = request.GetResponse() as HttpWebResponse)
{
StreamReader reader = new StreamReader(httpResponse.GetResponseStream());
string jsonResponse = reader.ReadToEnd();
response = JsonConvert.DeserializeObject(jsonResponse);

}
// Write the Charge ID to the console.
System.Console.WriteLine(response.id);
return RedirectToAction("Index", "Home");
}
