package ar.com.todopago.api;

public final class ElementNames {

	// Enum for WSDL & Endpoint
	public static final String AuthorizeWSDL = "AuthorizeWSDL";
	public static final String OperationsWSDL = "OperationsWSDL";
	public static final String PaymentMethodsWSDL = "PaymentMethodsWSDL";
	public static final String Endpoint = "Endpoint";

	// Operations
	public static final String OperationID = "OperationID";
	public static final String Barcode = "Barcode";
	public static final String CardHolderName = "CardHolderName";
	public static final String CardNumber = "CardNumber";
	public static final String CuponExipartionDate = "CuponExpDate";
	public static final String CuponSecondExpirationDate = "CuponSecExpDate";
	public static final String CuponSubscriber = "CuponSubscriber";
	public static final String CurrencyCode = "CurrencyCode";
	public static final String CustomerMail = "CustomerMail";
	public static final String Identification = "Identification";
	public static final String IdentificationType = "IdentificationType";
	public static final String InstallmentPayments = "InstallmentPayments";
	public static final String ResultCode = "ResultCode";
	public static final String ResultMessage = "ResultMessage";
	public static final String Type = "Type";
	public static final String Amount = "Amount";
	public static final String DateTime = "DateTime";
	public static final String TicketNumber = "TicketNumber";
	public static final String ErrorMessage = "ErrorMessage";
	public static final String Operation = "Operation";
	public static final String STARTDATE = "STARTDATE";
	public static final String ENDDATE = "ENDDATE";
	public static final String PAGENUMBER = "PAGENUMBER";

	// PaymentMethods
	public static final String Id = "Id";
	public static final String Name = "Name";
	public static final String Logo = "Logo";
	public static final String BankId = "BankId";
	public static final String PaymentMethodId = "PaymentMethodId";
	public static final String ExpirationDateCheck = "ExpirationDateCheck";
	public static final String CardNumberLengthMax = "CardNumberLengthMax";
	public static final String CardNumberLengthMin = "CardNumberLengthMax";
	public static final String SecurityCodeLength = "SecurityCodeLength";
	public static final String Bank = "Bank";
	public static final String PaymentMethod = "PaymentMethod";
	public static final String PaymentMethodBank = "PaymentMethodBank";
	public static final String Currency = "Currency";
	public static final String Description = "Description";
	public static final String Discount = "Discount";
	public static final String InstallmentsMax = "InstallmentsMax";
	public static final String InstallmentsMin = "InstallmentsMin";
	public static final String Promo = "Promo";
	public static final String BuyerCfBonus = "BuyerCfBonus";
	public static final String Coefficient = "Coefficient";
	public static final String DirectRate = "DirectRate";
	public static final String FeeQuantity = "FeeQuantity";
	public static final String Payment = "Payment";
	public static final String PromotionId = "PromotionId";
	public static final String RateId = "RateId";
	public static final String SellerCfBonus = "SellerCfBonus";
	public static final String Tna = "Tna";
	public static final String PromotionsCollection = "PromotionsCollection";

	// Authorize
	public static final String Security = "Security";
	public static final String Session = "Session";
	public static final String Merchant = "Merchant";
	public static final String RequestKey = "RequestKey";
	public static final String AnswerKey = "AnswerKey";
	public static final String StatusCode = "StatusCode";
	public static final String StatusMessage = "StatusMessage";
	public static final String AuthorizationKey = "AuthorizationKey";
	public static final String EncodingMethod = "EncodingMethod";
	public static final String Payload = "Payload";
	public static final String UrlRequest = "URL_Request";
	public static final String UrlError = "URL_ERROR";
	public static final String UrlOK = "URL_OK";
	public static final String PublicRequestKey = "PublicRequestKey";
	public static final String EMAILCLIENTE = "EMAILCLIENTE";

	// Authorize return
	public static final String RequestChannel = "RequestChannel";
	public static final String Authorizationcode = "Authorizationcode";

	// Headder
	public static final String Authorization = "Authorization";
	
	public static final String RequestType = "RequestType";
	public static final String VoidRequest = "VoidRequest";
	public static final String ReturnRequest = "ReturnRequest";
	
	// getCredentials
	public static final String USUARIO = "USUARIO";
	public static final String CLAVE = "CLAVE";
}
