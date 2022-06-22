# DBeaverのインストール手順

1. Eclipseから`Eclipse Marketplace`を開く。  
![picture 1](image/9b54072c48875e6d232cb290e76dc088ffafd1c079ad3e732356acbbe701b976.png)  

1. 検索バーで`dbeaver`と検索。 いくつかDBeaverと記載のあるプラグインが出てくるが、`DBeaver {version}`と記載があるものの`install`をクリック。  
![picture 2](image/8b9053e3ecf6b97db3e97ea5e9f3a28568b2636e1d5445696dc3c204e1546e53.png)  

1. `Confirm`をクリック。  
![picture 3](image/aed557d00dfe923f78b9fa703de215912e29729aa90d107391a7e06e8ed2556e.png)  

1. このウィンドウが表示されたら、`Unsigned`にチェックして、`Trust Selected`をクリック。  
![picture 4](image/244f53f753b26b8aec9fb99adfe90d8b13d53c337fae9a366af89bd7c4cabd78.png)  

1. Eclipseの再起動を求められたら再起動。  

1. 再起動できたら上部メニューバーから`Window`->`Show View`->`Other`をクリック。  
![picture 5](image/584df8e30a5b19b15e4ed36b213eb8f54c3d3d8a6ed06a6d9a90b098f1f30ef2.png)  

1. データベースナビゲータをクリック。  
![picture 6](image/191d3bc403957cf896c95d4dbc1d6e8f678b9e86da6414bbb775045456504b48.png)  

1. データベースナビゲータの右上の新しい接続をクリック。  
![picture 7](image/bca250ddd4bb5f288ec8aba269f51905b250252c1f096b5a19af237d37d79cfa.png)  

1. MySQLのロゴを選択して`Next`をクリック。  
![picture 8](image/a05f92be19105e78daf2188b8799e8931a3128b805694f9854bdc3659688cacd.png)  


1. `Database`と`パスワード`を入力して、`テスト接続`をクリック。  
![picture 9](image/ecb75f7d32afbaf3102aaa7947e06b43b07ca56650f7b765cf0abceb5157bcde.png)  

1. 接続できることを確認。
(`ここでMySQLドライバがみつかりません`と記載されたウィンドウが表示されたら、そのウィンドウのダウンロードボタンをクリック。)  
![picture 10](image/f8f3952eb979e7a8a52e7eea433077fcd215732189647312fb552c34aeefd50c.png)  

1. Finishをクリック。  
![picture 11](image/aec35168abb08964c4977feb679f0935204af848d7b3a6a9b33f846d3d592292.png)  

1. データベースナビゲータからテーブルを選択してみます。  
![picture 12](image/16413911580ce27410debfa616839887d4521af34e91b896162bf0f14a929d72.png)  

1. 対象のテーブルにアクセスできることを確認。  
![picture 13](image/f3874e6da569d855f4e27c3be5662e71d4824c0f038b66f6da9e70a9068ea501.png)  

1. 右上の検索アイコンをクリックすると検索バーが表示。`SQLエディタ`を入力して、`SQLエディタを開く`をクリック。<div style="color:red;"><strong>※他にSQLエディタを開く方法が見つからなかった。良い方法見つけたらIssueで連絡いただきたいです。</strong></div>
![picture 15](image/00ec3fa7ca7a9ef947f0ed4633ede7bdd2618691e36cbaf2810525452895688e.png)  

1. SQLエディタが開いたら`select * from sellers;`を入力して`Ctrl + Enter`または左側のSQLの実行アイコンをクリック。  
![picture 16](image/082321cd829ebc6d498614fbb2018bdfd6b5a85bf450c6142bc6a2c034f7aaa2.png)  

1. SQLが実行できたことを確認。  
![picture 17](image/250e04d46faecede512976419a2f598e96bb15e656d4d50cb30def856eed36ab.png)  

以上。