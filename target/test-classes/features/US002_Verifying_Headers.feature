@tc02
Feature:US002_Verifying_Headers

  Scenario: TC02 <--> User validates "ROTA OPTIMIZASYONU" sub component
    Given Go to "movita" page
    And validates ROTA OPTIMIZASYONU component
    Given hover on ROTA OPTIMIZASYONU


  @tc03
  Scenario: TC03 <--> User validates "UYGULAMALAR" sub component
    Given Go to "movita" page
    And validates UYGULAMALAR component
    Given hover on UYGULAMALAR

  @tc04
  Scenario: TC04 <--> User validates "KILAVUZ" sub component
    Given Go to "movita" page
    And validates KILAVUZ component
    Given hover on KILAVUZ

    @tc05
    Scenario: TC05 <--> User validates "İLETİŞİM" sub component
      Given Go to "movita" page
      And validates İLETİŞİM component
      Given hover on İLETİŞİM


