# WEB上でQRを使ってスタンプラリーの開発

## 手順

### 最初にQRを読み取らせる

* フロントで名前を記述後QR（トップページに飛ぶサイト）を読み取らせる

* 携帯を持っていない人は紙で渡すようにする



### 読み取られると端末ごとに一意性の番号が振られる

* データベースに一意性の番号が入る

* sessionで10時間だけ持たせるようにする




### スタンプをする画面が表示される

* 各学科の名前と枠が用意される

* 残りのスタンプ数を表示させる



### 各学科のQRを読み取る

* サイトを開かずカメラでQRを読み取り、URLの後ろにパラメータとして値を入れて各学科に対応するデータベースにtrueを書く（[QRを作成するサイト](https://tool-taro.com/qr_code_encode/)）



### スタンプの表示

* データベースから値をとってきて、true判定をしてその学科のスタンプが押される



### 最後に見せる

* 全部たまったらBINGOカードと交換する（その際に完了ボタンを押すとスタンプの上に「済」と表示される）



___

## スタンプのデザイン　
### [外部サイト](http://generator.tubudeco.com/g1256/)で作成
* 済みスタンプのみ生成


## 各学科のURL

### 建築監督
* URL?Department=Architectural_director

### 建築
* URL?Department=Architecture

### インテリア
* URL?Department=interior

### 情報処理
* URL?Department=Information_processing

### ゲームプログラミング
* URL?Department=game_programming

### web動画クリエーター
* URL?Department=WEB_animation_creator

### 環境テクノロジー
* URL?Department=Environmental_technology

### バイオテクノロジー
* URL?Department=Biotechnology

## セキュリティ対策

## 使う言語
* java
* HTML
* CSS

## 使う環境
* スマホ

## サーバー環境
* tomcat
* AWS

## 追加機能（できたら）

### アンケート機能
* スタンプを最後までやり終わった後にアンケートするボタンが表示されるようになる
* アンケートを答えるとBINGOカードをもらうことができるようにする
* 答えたかどうかの判定はスタンプが押される



## データベースのテーブル

* ID ・・・primary key

* ほかの各要素 ・・・defaultでfalse



| ID   | 建築監督   | 建築   | インテリア   | 情報処理   | ゲームプログラミング   | web動画クリエーター   | 環境テクノロジー   | バイオテクノロジー科   |  スタンプ確認済  |  
| ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | --- |
|
