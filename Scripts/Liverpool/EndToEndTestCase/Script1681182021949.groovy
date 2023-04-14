import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint

import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import static com.kms.katalon.core.testdata.TestDataFactory.findTestData

import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint

import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import com.kms.katalon.core.model.FailureHandling as FailureHandling

import com.kms.katalon.core.testcase.TestCase as TestCase

import com.kms.katalon.core.testdata.TestData as TestData

import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable as GlobalVariable

import org.openqa.selenium.Keys as Keys

import customkeywords.myKeywords as myKeywords

 

WebUI.openBrowser('')

 

WebUI.navigateToUrl('https://www.liverpool.com.mx/tienda')

 

WebUI.maximizeWindow()

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/Logo_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/searchTextbox_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/a_Mis Compras_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/span_Iniciar sesin_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/bagIcon_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/multiSites_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/span_Categoras_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/primaryBanner_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/secondaryBanner_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/carousel1_hp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('HomePage/footer_hp'))

 

CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/span_Iniciar sesin_hp'))

 

WebUI.setText(findTestObject('HomePage/input_Correo electrnico_username_login'), 'sudha.addepalli6662@gmail.com')

 

WebUI.setEncryptedText(findTestObject('HomePage/input_Contrasea_password_login'), 'R2dZ4hvJ2uivgdeNE3/vtQ==')

 

CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/button_Iniciar sesin_login'))

 

CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/span_Categoras_hp'))

 

CustomKeywords.'customkeywords.myKeywords.clickElementWithoutScroll'(findTestObject('HomePage/l1Category_hp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('BLPPage/breadCrumb_blp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('BLPPage/l2Category_blp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('BLPPage/l2Category_blp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CLPPage/breadCrumb_clp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CLPPage/a_Ver todo_clp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CLPPage/l3Category_clp'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('CLPPage/l3Category_clp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/breadCrumb_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/div_Categoras_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/div_Marcas_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/div_Precios_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/div_Tamao_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/div_Vendido por_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/label_Color_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/label_Descuentos_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/productName_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/productImage2_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/productPrice_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/listView_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/gridView_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/button_Relevancia_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/button_Lo Ms Nuevo_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/button_Mayor precio_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/button_Menor precio_plp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/button_Calificaciones_plp'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('PLPPage/a_Color_variants-normalizedColor-Blanco_plp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/a_Limpiar Filtros_plp'))

 

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PLPPage/carousel_plp'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('PLPPage/productImage2_plp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/breadCrumb_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/alternateImages_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/productImage_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/productName_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/quantity_pdp'))

 

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/regularPrice_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/DiscountPriceprice_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/p_Cdigo de Producto_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/ITRLink_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/ratingSection_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/span_Compartir_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/p_Ver ms promociones_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/h3_Ofertas y promociones_pdp'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/h3_Opiniones del artculo_pdp'))

 

WebUI.delay(3)

 

not_run: CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('PDPPage/selectSize1'))

 

WebUI.scrollToElement(findTestObject('PDPPage/quantity_pdp'), 0)

 

WebUI.click(findTestObject('PDPPage/selectSize1'))

 

WebUI.delay(3)

 

not_run: CustomKeywords.'myKeywords.verifyElementPresentKeyword'(findTestObject('PDPPage/carousels_pdp'))

 

not_run: CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

 

WebUI.scrollToElement(findTestObject('PDPPage/quantity_pdp'), 0)

 

WebUI.click(findTestObject('PDPPage/button_Agregar a mi bolsa_pdp'))

 

WebUI.delay(5)

 

not_run: CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('HomePage/bagIcon_hp'))

 

WebUI.click(findTestObject('HomePage/bagIcon_hp'))

 

WebUI.delay(3)

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/span_Mi Bolsa_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/myBagImageProduct_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/productName_cart'))

 

not_run: CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/productPrice_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_EliminarIcon_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/totalPrice_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_mesaDeRegalos_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_Mover a Wishlist_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_Eliminar_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_Comprarahora_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/priceSection_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_Comprar_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/div_Entregaestimada_cart'))

 

not_run: CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/div_carouselSection_cart'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('CartPage/button_SeguirComprando_cart'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('CartPage/button_Comprar_cart'))

 

WebUI.delay(3)

 

ActualOPCPageUrl = WebUI.getUrl()

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/h4_Confirma tu compra_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/deliveryAddressHeading_address_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/label_Cambiar_Address_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/Forma de Pago_payment_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/paymentSection_payment_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/label_Cambiar_payment_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/productSection_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/productImage_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/productName_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/productprice_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/totalPrice_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/promotionSection_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/button_Comprar para mesa de regalos_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/button_Mover a Wishlist_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/button_Eliminar_opc'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('checkoutpage/button_Cupones_opc'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('checkoutpage/label_Cambiar_payment_opc'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('checkoutpage/button_Efectivo y Transferencias_payment_opc'))

 

not_run: CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('checkoutpage/button_Continuar_payment_opc'))

 

WebUI.click(findTestObject('checkoutpage/button_Continuar_payment_opc'))

 

WebUI.delay(4)

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('checkoutpage/button_Finalizar compra_opc'))

 

WebUI.delay(3)

 

actualConfirmationUrl = WebUI.getUrl()

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/gracias por comprar_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/a_Mis compras_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/productDetailHeading_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/productImage_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/div_Entrega estimada_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/addressSection_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/paymentSection_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/totalPrice_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/legalInfo_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

 

referenceNumber_confirmation = WebUI.getText(findTestObject('ConfirmationPage/referenceNumber_confirmation'))

 

not_run: CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/carousel_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('ConfirmationPage/button_Continuar comprando_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('ConfirmationPage/button_Descargar ticket de pago_confirmation'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('ConfirmationPage/button_Ir a Mis compras_confirmation'))

 

WebUI.delay(3)

 

actualMisComprasUrl = WebUI.getUrl()

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

WebUI.setText(findTestObject('MisComprasPage/mainSearchbar_misCompras'), referenceNumber_confirmation)

 

WebUI.sendKeys(findTestObject('MisComprasPage/mainSearchbar_misCompras'), Keys.chord(Keys.ENTER))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/breadCrumb_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/aside_leftNavigation_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/mainSearchbar_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/span_Filtrar compras_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/productName_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/img_product__image_misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('MisComprasPage/button_Comprar nuevamente__misCompras'))

 

CustomKeywords.'customkeywords.myKeywords.clickElement'(findTestObject('MisComprasPage/button_Ver detalle de compra_misCompras'))

 

WebUI.delay(3)

 

actualMisComprasUrl = WebUI.getUrl()

 

CustomKeywords.'customkeywords.myKeywords.scrollWindow'()

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('OrderDetailsPage/h1_Detalle de compra_orderDetails'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('OrderDetailsPage/addressSection_orderDetails'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('OrderDetailsPage/paymentSection_orderDetails'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('OrderDetailsPage/productDetails_orderDetails'))

 

CustomKeywords.'customkeywords.myKeywords.verifyElementPresentKeyword'(findTestObject('OrderDetailsPage/referenceNumber_orderDetails'))

 

WebUI.verifyTextPresent(referenceNumber_confirmation, false)