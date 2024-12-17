DROP DATABASE IF EXISTS family_table;
CREATE DATABASE family_table;
USE family_table;
DROP TABLE IF EXISTS family;
CREATE TABLE family
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    familyName VARCHAR(255)  NOT NULL,
    phone       VARCHAR(255)  NOT NULL,
    email       VARCHAR(255)  NOT NULL,
    zipCode    VARCHAR(255)  NOT NULL,
    pets        VARCHAR(255)  NOT NULL,
    meal        VARCHAR(255)  NOT NULL,
    description VARCHAR(1000) NOT NULL,
    available   BOOLEAN       NOT NULL
);
INSERT INTO family(familyName, phone, email, zipCode, pets, meal, description, available)
VALUES ('Silva', '917778899', 'familia-silva@mail.pt', '1000-110', 'Dog', 'Bacalhau Assado, Lombo de porco',
        'Somos uma família acolhedora e unida, que celebra a magia do Natal com amor e alegria. Na noite de Natal, seremos 6 pessoas à volta da mesa, partilhando momentos especiais. Teremos todo o prazer em receber alguém para se juntar a nós nesta noite tão especial!',
        TRUE),
       ('Antunes', '914447755', 'familia-antunes@mail.pt', '1000-190', 'Cat', 'Bacalhau Cozido, Peru',
        'Somos uma família pequena, mas cheia de carinho e boas energias. Na noite de Natal, seremos 3 pessoas reunidas num ambiente simples e acolhedor. Adoraríamos abrir as portas e receber alguém para partilhar esta noite especial conosco!',
        TRUE),
       ('Ramos', '913334455', 'familia-ramos@mail.pt', '1000-135', 'Dog & Cat', 'Bacalhau com Broa, Borrego',
        'Somos uma família grande e cheia de vida, onde as risadas e a alegria não faltam. Na noite de Natal, seremos 10 pessoas reunidas para celebrar esta data tão especial. Teríamos o maior prazer em receber alguém para se juntar a nós e fazer parte da nossa festa!',
        FALSE),
       ('Torres', '913224456', 'familia-torres@gmail.pt', '1000-23', 'Cat', 'Arroz de Pato',
        'Somos uma família pequena, mas o nosso amor e cumplicidade tornam cada momento especial. Na noite de Natal, seremos apenas nós dois, mas com o coração cheio de alegria e gratidão. Será uma celebração íntima e acolhedora, repleta de sorrisos, bons momentos e, claro, muito carinho. Adoraríamos partilhar essa noite mágica com mais alguém, oferecendo um espaço cheio de calor e boa companhia.',
        TRUE),
       ('Almeida', '912224456', 'familia-almeirda@gmail.pt', '1000-50', 'Dog', 'Bacalhau Cozido',
        'Somos uma família de três, onde a harmonia e o afeto marcam cada instante. Na noite de Natal, estaremos unidos, desfrutando da magia desta data com risos, lembranças e o calor do lar. A celebração será acolhedora e cheia de momentos especiais, e seria um prazer imenso compartilhar essa noite encantada com mais alguém, criando novas memórias e espalhando alegria.',
        FALSE);