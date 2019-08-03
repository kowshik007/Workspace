CREATE TABLE article (
    id SERIAL PRIMARY KEY,
    userid INT,
    articlename VARCHAR(70),
    articledescription TEXT,
    seo_keywords VARCHAR(100),
    seo_metadata VARCHAR(160),
    created_timestamp TIMESTAMP,
    modified_timestamp TIMESTAMP
);
CREATE TABLE auth_user (
    id INT PRIMARY KEY,
    username VARCHAR(25),
    userpassword CHAR(64),
    lastlogintime TIMESTAMP,
    created_timestamp TIMESTAMP,
    modified_timestamp TIMESTAMP
);
CREATE TABLE category (
    id TINYINT PRIMARY KEY,
    category_name VARCHAR(25),
    category_image BLOB,
    seo_title VARCHAR(25),
    seo_keywords VARCHAR(100),
    seo_metadata VARCHAR(160),
    created_timestamp TIMESTAMP,
    modified_timestamp TIMESTAMP
);
CREATE TABLE subcategory (
    id TINYINT PRIMARY KEY,
    category_id TINYINT REFERENCES category (id),
    sub_category_name VARCHAR(25),
    sub_category_image BLOB,
    seo_title VARCHAR(25),
    seo_keywords VARCHAR(100),
    seo_metadata VARCHAR(160),
    created_timestamp TIMESTAMP,
    modified_timestamp TIMESTAMP
);
ALTER TABLE article add CONSTRAINT fk_auth_user foreign key(userid) references auth_user(id);
ALTER TABLE article add column subcategory_id tinyint references subcategory(id);
ALTER TABLE category MODIFY id tinyint AUTO_INCREMENT;
ALTER TABLE subcategory MODIFY id tinyint AUTO_INCREMENT;
ALTER TABLE auth_user MODIFY id int AUTO_INCREMENT;