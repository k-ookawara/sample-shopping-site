# DBViewerのインストールと設定

1. メニューバーより`Help`->`Eclipse Marketplaces`をクリック。
![picture 3](images2/610f79d29f58162b40b5f4ab3fbfccfada76a19f2a908ba3424f027372438b3d.png)  

1. 検索バーにdbViewerを入力して検索。DBViewerのInstallをクリック。
![picture 4](images2/7f0f5e19f3419dc76b883dcdf1835bd5d911fcbefd504c47832b626cff3722a3.png)  

1. この画面が出た場合は、UnsignedにチェックしてTrast Selectedをクリック。
![picture 5](images2/48079984949cbb62972606fc29a5b4572bc8281d034bff87e0f4fe1071df55f4.png)  

1. 再起動を求められるので再起動。
![picture 6](images2/2ee2fe2bb1f4118ad74c92af8f9bbfb3f58d0d7340dd9c4c29f012c3fdf3a5d0.png)  

1. 再起動したらメニューバーの`Window`->`Show View`->`Other`をクリック。
![picture 7](images2/c0b7e6f31829870e90c066697e200addcb472aeb9e51b3c1fb645131d2705d6d.png) 

1. DBツリー・ビューを選択して、Openをクリック。
![picture 8](images2/8bd1d64cf9e4b040596c90b3d52bb078ed8a11aac97f61af218ad2d006137f0a.png)  

1. DBViewerPluginを右クリックして、登録をクリック。
![picture 9](images2/1b2ee6b47d6b63360715d313ea52e3657f7c41b71ccd94a2cdc7d80e86f04d8a.png)  

1. ファイル追加をクリック。
![picture 11](images2/dfae7fb7c8d7adfeb2ea8fb9f77e1691754c6f2edb0039ec9e713044fdb51c4b.png)  

1. 以下のファイルを選択して、開くをクリック。
`C:\Program Files (x86)\MySQL\Connector J 8.0\mysql-connector-java-8.0.29.jar`
![picture 12](images2/8c72bd76eb08ea64cfbaf40de63ef4d0a1828cbc03e67ee01c8d6b413d491e5b.png)  

1. データベース名は任意入力でNextをクリック。
![picture 13](images2/5ad0a727a3408a3a35bf35705435ac652bf693e5b408820bdcb21f8984ba9435.png)  

1. JDBC Driverで`com.mysql.jdbc.Driver`を選択。
![picture 14](images2/da2e808ee8055893a29bebaf7ebced6c7fc07d8515d2e3692239907db3ee8510.png)  

1. JDBC Driverを選択すると自動でテンプレートが入力される。
![picture 15](images2/962c38247f14d7319c620347379324096fadfeced16fbcf92dbe8705a8b17ce5.png)  

1. 以下の通り入力して、テスト接続をクリック。ウィンドウ上部に`接続に成功しました`が表示されることを確認して、Nextをクリック。

    | 項目名 | 入力値 |
    | --- | --- |
    | 接続文字列 | jdbc:mysql://localhost:3306/shop |
    | 接続ユーザ | root | 
    | 接続パスワード | MySQL環境構築時に設定したパスワード |
    
    ![picture 16](images2/2159b8a8545bb8023002bce165c1aa5ee14a513d396757b5d3d3bd92c36306e3.png)  

1. Finishをクリック。
![picture 17](images2/cc443566be0cac7f52c00f76f1dc0bffb54b9b428efe9b942c8708739a90f3e9.png)  

1. 追加したDB定義で右クリックして、接続をクリック。
![picture 18](images2/aa784306512d2aa9aa7dd984e28acd334730ac9856ed9fbea80716d9273b40e6.png)  

1. `shop`->`TABLE`->`sellers`をクリックして、テーブルの内容が確認できること。
![picture 19](images2/7bf96d3e8023f71304667028928c0d486c6f77f52cf1df6d1ae2b1975a311076.png)  

1. メニューバーの`Window`->`Show View`->`Other`をクリック。
![picture 7](images2/c0b7e6f31829870e90c066697e200addcb472aeb9e51b3c1fb645131d2705d6d.png) 

1. `DBViewer Plugin`->`SQL実行・ビュー`を選択して、Openをクリック。
![picture 20](images2/6816ac5e2bbd34c14d5ab92ae9ddf3547d48fdd2e11dd1556e04bb4a14e09a4f.png)

1. `SQL 実行ビュー`のビューが表示。`select * from sellers;`を入力して`Shift + Enter`でSQLを実行。
![picture 21](images2/25e610924e83d2dfe80d96946403b819606dce219afb993963636350a193c9da.png)  

1. SQLの実行結果が表示されることを確認。
![picture 22](images2/a6a4e51b805e62adf672e5b85d8ae04319be0084593317656b516e979c870824.png)  
