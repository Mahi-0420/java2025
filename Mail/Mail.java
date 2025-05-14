package Mail;

// 必要な部品を読み込むところ
import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

public class Mail {
    public static void main(String[] args) {
        // メールを送信するメソッドを呼び出す
        sendMail();
    }

    public static void sendMail() {
        // =========================
        // ロリポップの設定
        // =========================
        final String username = "info@magi-420.daa.jp";  // ロリポップのメールアドレスアカウント
        final String password = "Webpop_2562";      // そのメールのパスワード

        // =========================
        // メールの内容
        // =========================
        final String toEmail = "2410056@i-seifu.jp";    // 送信先のメールアドレス
        final String fromEmail = "2410041@i-seifu.jp";    // 送信元のメールアドレス
        final String fromName = "山口 歩希";    // 送信者名
        final String title = "テスト件名";
        final String bpdy = """
                            大丈夫か？
                            """;    // メール本文

        // =========================
        // メールの設定
        // =========================
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.lolipop.jp");   // SMTPサーバーのアドレス設定
        props.put("mail.smtp.port", "465");     // SMTPサーバーのポート設定
        props.put("mail.smtp.auth", "true");    // SMTPサーバーの認証設定
        props.put("mail.smtp.ssl.enable", "true");  // SMTPサーバーの認証設定
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");    // SMTPサーバーのSSL設定

        // =========================
        // メールの認証(ログイン)処理
        // =========================
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // =========================
        // メールの送信処理
        // =========================
        try {
            // メールの内容を作成
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromName, "UTF-8"));    // 送信元のメールアドレスと名前
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));    // 送信先のメールアドレス
            message.setSubject(title);    // 件名
            message.setText(bpdy);    // 本文

            // メールを送信
            Transport.send(message);
            System.out.println("メール送信成功");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // メールを送信するメソッド

}