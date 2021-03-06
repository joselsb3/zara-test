DROP TABLE IF EXISTS BRANDS;
DROP TABLE IF EXISTS PRICES;

CREATE TABLE BRAND(
    BRAND_ID INT AUTO_INCREMENT PRIMARY KEY,
    BRAND_NAME VARCHAR(128) NOT NULL
);

CREATE TABLE PRICE(
    BRAND_ID INTEGER,
    foreign key (BRAND_ID) references BRAND(BRAND_ID),
    START_DATE DATE NOT NULL,
    START_TIME TIME NOT NULL,
    END_DATE DATE NOT NULL,
    END_TIME TIME NOT NULL,
    PRODUCT_ID INTEGER NOT NULL,
    PRICE_LIST INT PRIMARY KEY,
    PRIORITY SMALLINT NOT NULL,
    PRICE NUMERIC(8,2),
    CURR VARCHAR(4) NOT NULL
);

