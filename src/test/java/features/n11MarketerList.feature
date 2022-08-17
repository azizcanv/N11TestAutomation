@n11marketerlist

Feature: N11 sitesinden a ile başlayan markaların txte yazılma senaryosu

  Scenario: N11 mağazaları görüntüleyip txte yazdırma
    Given N11 anasayfası açılır
    When Mağazalar tıklanır
    And A ile başlayan mağazalar listelenir
    Then Listelenen mağazalar txte yazdırılır
