@n11addproduct

Feature: N11 sepete ürün ekleme senaryosu
  Scenario Outline:
    Given N11 anasayfası açılır
    When Arama çubuğuna <urun> yazıp aratılır
    And Gelen sonuçlar yorum sayısına ve ücretsiz kargo olanlara göre sıralanır
    And Gelen sonuçlardan ilk sayfadaki birinci ve son ürün sepete eklenir
    And Sepete gidilerek ürünlerden en ucuzunun adedi 2 yapılır
    Then Misafir kullanıcı olarak ödeme adımına ilerlenir

    Examples:
      | urun     |
      | kulaklik |

