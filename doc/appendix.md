# Appendix

### 目次

+ [application.propertiesを開いたときにエラーが発生した場合の対処](#application.propertiesを開いたときにエラーが発生した場合の対処)

+ [EclipseでMarkdown、UMLを書くための準備](#EclipseでMarkdown、UMLを書くための準備)

---

### application.propertiesを開いたときにエラーが発生した場合の対処

![picture 57](images2/917ad685344b0ffbb9c42e62d240d1202cd401e40b551a622b28a255481160b7.png)  

上のようにapplication.propertiesを開いたときにエラーが発生した場合、以下のリンクを参考にして対応が可能です。

[https
://github.com/spring-projects/sts4/issues/775](https://github.com/spring-projects/sts4/issues/775)

1. メニューバーから`Help` -> `Install New Software`をクリック。 
![picture 58](images2/b49cde525566ff7bbe7d55cf3ad89ed7c4ab2180cfa47b56a4cdbe1acdf2ccec.png)  

1. Addボタンをクリック。
![picture 59](images2/6d3eb2ad6b3bba3109eb63f24918378e65bbb9681b94eae245fb07cb00891f84.png)  

1. Nameは任意。Locationに`http://download.eclipse.org/tm4e/snapshots/`を入力して、Addをクリック。
![picture 60](images2/0eb7b8f71b7238506ef3c5aa1feb71ab9f54018a82d26c4227b0b8e393e4fc27.png)  

1. `TextMate`->`Text Mate Core`にチェックを入れてNextをクリック。
![picture 61](images2/0e5b52d305072549f302e31a4a63117d2e21fe7e123a3b7c78b98f98c6f2351f.png)  

1. Nextをクリック。
![picture 62](images2/d44c9b3c27556e8762fe99f1f74e1f82277e38d0b7646c84051397cab9f39790.png)  

1. ラジオボタンをチェックして、Finishをクリック。
![picture 63](images2/f284be58ea46d8fa959db03cbb216a563ddd01cf30910b3db573012a20ab16f6.png)  

1. Eclipseを再起動して、application.propertiesが開けるかどうか確認。
![picture 64](images2/a8b6e8117cb6e6a9b12920157eed7320d186ff9535d7bc3f33669e1f05b896c8.png)  

---

### EclipseでMarkdown、UMLを書くための準備

1. `Help`->`Eclipse Marketplace`をクリック。
![picture 4](images2/f994c6f456473e34d7dd03aeac301b61bb653575ee0f7aaf940744c4dd00383e.png)  

1. 検索バーに`fluentmark`を入力して検索。FluentMarkをインストールする。
![picture 5](images2/34a345a923eb985691ea07f4d8de9ce6f020d6c4af6c2fd0c35fcfd7a7caad5c.png)  

1. [Pandoc](https://pandoc.org/installing.html)をインストールする。
![picture 6](images2/d19a91fa9d8e192f5221ab76f04eab6cbdd480c781d68c68ab3b15a4b1584267.png)  

1. [Graphviz](https://graphviz.org/download/)をインストールする。
![picture 9](images2/56086891b731ce456b66aa35c4b5e603c98e177752796ad6b1efeda1a78ec1d7.png)  


1. `Window`->`Preferences`からEclipseの設定画面を開く。 
![picture 10](images2/e7e824895c135ad983fe0ce8edef0b09826e3aa93006cbd56f29b99ae46b476c.png)  

1. 以下の通り、Fluentmarkの設定を行います。
+ 左側のリストから`Fluentmark`を選択。
+ `Markdown`->`Converter`はPandocを選択。
+ `Add table of contents`をチェック。
+ `Locations`->`Program`にpandoc.exeのファイルパスを入力。
+ `Enable PlantUML Generator`をチェック。
+ `Enable Graphviz Generator`をチェック。
+ `Dot executable`にdot.exeのファイルパスを入力。
![picture 12](images2/a8ab42c3a21c6fe289291dc4978941767861e7e6907f2e095bf4a8a9bdf1c287.png)  

1. 試しにMarkdownで記載されたmdファイルを変換した状態で確認。`Project Explorer`から`/sample-shopping-site/doc/consept.md`を開く。
![picture 13](images2/19c73d1bfa5d470a05988dbc19a9df3fe47d2f8965542660508d5bcc5aaad7dc.png)  

1. Eclipse上部のツールバーの、`Open FluentMark Viewer`のアイコンをクリック。
![picture 14](images2/a80cc8f40c7757aa53ecf06440d1026e18649def3ee9563960513bc52e660408.png)  

1. ブラウザでスタイリングされた文章やUMLが確認できるようになりました。
![picture 15](images2/9d0ffcddd67f64be122612ffcb36f2b5de4dedcd2b62fac7251c50854daaac58.png)  

