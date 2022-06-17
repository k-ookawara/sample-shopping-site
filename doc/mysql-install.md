# MySQLのインストールと準備手順

1. [https://www.mysql.com/jp/downloads/](https://www.mysql.com/jp/downloads/)にアクセスする。

1. ページ下部の`MySQL Community (GPL) Downloads »`をクリック。
![picture 16](images/9b2a8b55d023d762a0e1339bbf48312f95b6a70a4c950aac372f76bd1f2bc221.png)  

1. `MySQL Installer for Windows`をクリック。
![picture 17](images/7abd15226e670d55210ba91f551ba4c8bf8dba02a56606abee97a2bfdecd58b7.png)  

1. ダウンロードサイズが少ない上のDownloadボタンをクリック。
![picture 26](images2/adf3a74d938659c39f6e054178bb50e9bf40afec45e33cc4935f971e1aadb641.png)  

1. 下部の`No thanks, just start my download.`をクリック。ダウンロードが完了したらインストーラを起動。
![picture 27](images2/fefbcdd368dc68cb155c5fb507b637d9c0685d4e546b8d2ff86471346b9e0a48.png)  

1.  `Developer Default`を選択してNextをクリック。
![picture 28](images2/a5df14733827ac36a005f585a66dd5b6eb8a5de7eb9ccd3d1de37517926191ee.png)  

1. Nextをクリック。
![picture 29](images2/8e02df151d211c1f6636331d945311de82a4e1885b16494dfdd072262c72ea22.png)  

1. Nextをクリック。 
![picture 30](images2/1f4b530e5eb31fa89a9fb0cf73f2ba0550b6ce1ec0f13e3a4821ecae883a59db.png)

1. Executeをクリック。
![picture 31](images2/a1fbdcd1cc51ef656da31c99f2d6b5cb6c7d47c3558eb1bce6c836c320b2d435.png)  

1. ダウンロードが完了したらNextをクリック。
![picture 32](images2/3a68c10ce78df4a249432eb9c669a956702b5f7947e0356e6309521808b5c29f.png)  

1. Executeをクリック。インストールが完了したらNextをクリック。
![picture 33](images2/146ffe76396a44cd00bd87f9864bad1f0da9af7251860ab244d446a865dd88a8.png)  

1. Nextをクリック。
![picture 34](images2/09dde75f5b2e95dc2686603588ee4554b927e7715210408e220ded066b1ee075.png)  

1. Nextをクリック。
![picture 35](images2/7f14ea30d02078bc84543579c9fbe532a14e4155ac95310fb0f3486bb91e8a80.png)  

1. Nextをクリック。
![picture 36](images2/4d3231d9f94e7edb17628d2efeeba29dd443d5d28f48df378d27fa7205860afa.png)  

1. パスワードを入力して、Nextをクリック。
![picture 37](images2/f215bbad7aef3be016ae887704972ec3969b92a96f55da7e2f8603bde616aa0f.png)  

1. Nextをクリック。
![picture 38](images2/66214fdbfb096bd9073cab2e390c25b8e17949a44552ef7d9bfa078f9c5befba.png)  

1. Executeをクリック。
![picture 39](images2/99d278a9b8774a182ab40ca1736bdee78652f397f8e3a4d583d7daeaf8065b64.png)  

1. Finishをクリック。
![picture 40](images2/b576f90d28b86ff846b1224b24537987a441bf0499ef1f69d78dbc3801daa56e.png)  

1. Nextをクリック。
![picture 41](images2/255fe0e89afd72528e40da74b27b5b070b068e12b17f383c156e053c1e2f0579.png)  

1. Finishをクリック。
![picture 42](images2/9fa7dc30e2413312748c3fce666673fb07025ab6521995a39d311b8dfdf26a8e.png)

1. Nextをクリック。
![picture 43](images2/8c2ba1e80a69bfa7f19d0b5e51698c8a7fb3a83c242ee10a25d1762b48f3f56a.png)  

1. パスワードを入力してCheckをクリック。チェックが成功したらNextをクリック。
![picture 44](images2/bdd50a44cd30103c4d6feac3475d1d0a9a8881ef45ff2083e44cad58d3303125.png)  

1. Executeをクリック。
![picture 45](images2/f7147c0e18ae149739c9b6dfb267b7a48e744381d9f4709ac87da78e3e94aa70.png)  

1. Finishをクリック。
![picture 46](images2/85f3baa5f4ff9bfbe02dfbfebc1feab36d0500cd8ba5a75901ad0aa2414aa4b9.png)  

1. Nextをクリック。
![picture 47](images2/0a477e9d4dea03d7734329c802e64823f777c474620acef125d223e69ffb2d5a.png)  

1. Finishをクリック。
![picture 48](images2/dfc336432ea34cde71b47250f58d9eeff2685887dd1f5925eb53ae932df54336.png)  

1.  MySQL Workbenchが自動的に開くので、左下のLocal Instanceをクリック。
![picture 49](images2/1f53263ef74665139ff9a730da820e215e71a7f2ea0a4ee7cfbe475116fe433b.png)  

1. パスワードを入力してOKをクリック。
![picture 50](images2/28d95fa05ee098c49e0cc36c0b2859aef7e27e45717a569889fc243878cd21e5.png)  

1. [ddl.sql](../ddl/ddl.sql)のSQLをMySQL Workbench中央のQuery 1に貼り付けて、上から順番にSQLを実行。赤枠のアイコンでキーボードカーソル上のSQLが実行できる。
![picture 51](images2/1b6b488fdb2e18151b105edfc61db12854ebaf340df25224c50250d97b2d9f93.png)  

ここまででMySQL構築手順が完了です。