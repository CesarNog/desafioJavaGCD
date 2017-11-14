package magiccards.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "magicexpansioncategory")
public class ExpansionCategory {
	
	/*CREATE TABLE `magicexpansioncategory` (
		  `ExpansionCategoryId` smallint(5) NOT NULL,
		  `Name` varchar(128) NOT NULL,
		  `Type` char(1) NOT NULL,
		  PRIMARY KEY (`ExpansionCategoryId`),
		  UNIQUE KEY `PK_MagicExpansionCategory` (`ExpansionCategoryId`)
		) ENGINE=InnoDB DEFAULT CHARSET=utf8;
	*/
	
	@Id
	@Column(name = "expansioncategoryid")
	private short expansionCategoryId;	
	@Column(name = "name", columnDefinition = "text")
	private String name;
	@Column(name = "type", columnDefinition = "char")
	private String type;
}
