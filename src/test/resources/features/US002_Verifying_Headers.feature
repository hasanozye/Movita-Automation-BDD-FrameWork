@tc02 @tc01
Feature:US002_Verifying_Headers

  Scenario: TC02 <--> User validates "ROTA OPTIMIZASYONU" sub component
    Given Go to "movita" page
    And validates ROTA OPTIMIZASYONU component
    Given hover on ROTA OPTIMIZASYONU


  @tc03 @tc02
  Scenario: TC03 <--> User validates "UYGULAMALAR" sub component
    Given Go to "movita" page
    And validates UYGULAMALAR component
    Given hover on UYGULAMALAR

  @tc04 @tc02
  Scenario: TC04 <--> User validates "KILAVUZ" sub component
    Given Go to "movita" page
    And validates KILAVUZ component
    Given hover on KILAVUZ

  @tc05 @tc02
  Scenario: TC05 <--> User validates "İLETİŞİM" sub component
    Given Go to "movita" page
    And validates İLETİŞİM component
    Given hover on İLETİŞİM

  @tc06 @tc02
  Scenario: TC06 <--> User validates "İLETİŞİM" sub component
    Given Go to "movita" page
    And validates GİRİŞ YAP component
    Given hover on GİRİŞ YAP


