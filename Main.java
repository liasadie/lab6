public class Main {
    public static void main(String[] args) {
        EmailStore emailStore = new EmailStore();
        emailStore.addEmail("tsmith@gmail.com");
        emailStore.addEmail("tsmith@gmail.com");
        emailStore.addEmail("abaker@outlook.com");
        System.out.println(emailStore.hasEmail("tsmith@gmail.com"));
        System.out.println(emailStore.hasEmail("abaker@outlook.com"));
        emailStore.displayEmails();

        WordCounter wc = new WordCounter();

        wc.addSentence("This sentence has the word has in it twice");
        wc.outputResults();
    }
}

