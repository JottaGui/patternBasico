public class pessoa {

        private String firstname;
        private String lastname;
        private String nickname;
        private String email;


        private pessoa(String firstname, String lastname, String nickname, String email) {
                this.firstname = firstname;
                this.lastname = lastname;
                this.nickname = nickname;
                this.email = email;
        }

        public static class pessoabuilder{
                private String firstname;
                private String lastname;
                private String nickname;
                private String email;

                public pessoabuilder firstname(String firstname){
                        this.firstname = firstname;
                 return this;
                }
                public pessoabuilder lastname(String lastname){
                        this.lastname = lastname;
                        return this;
                }
                public pessoabuilder nickname(String nickname){
                        this.nickname = nickname;
                        return this;
                }
                public pessoabuilder email(String email){
                        this.email = email;
                        return this;
                }
                public pessoa build(){

                        return new pessoa(firstname, lastname, nickname, email);

                }
        }



}
