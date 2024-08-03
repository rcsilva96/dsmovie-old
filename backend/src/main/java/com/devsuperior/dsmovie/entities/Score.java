<<<<<<< HEAD
/*package com.devsuperior.dsmovie.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_score")

public class Score {
	
	@EmbeddedId
	
	private ScorePK id = new ScorePK();
	private Double value;
	
	public Score() {
		
	}
	
	public void setMovie(Movie movie) {
		
		id.setMovie(movie);
		
	}
	
	public void setUser(User user) {
		
		id.setUser(user);
		
	}

	public ScorePK getId() {
		return id;
	}

	public void setId(ScorePK id) {
		this.id = id;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
	

}*/

package com.devsuperior.dsmovie.entities;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
=======
package com.devsuperior.dsmovie.entities;

import javax.persistence.*;
>>>>>>> 29d6537 (Domain model, database seed)

@Entity
@Table(name = "tb_score")
public class Score {
<<<<<<< HEAD

    @EmbeddedId
    private ScorePK id = new ScorePK();

    @Column(name = "\"value\"")
=======
    @EmbeddedId
    private ScorePK id = new ScorePK();

>>>>>>> 29d6537 (Domain model, database seed)
    private Double value;

    public Score() {
    }

    public void setMovie(Movie movie) {
        id.setMovie(movie);
    }

    public void setUser(User user) {
        id.setUser(user);
    }

<<<<<<< HEAD
=======
    public ScorePK getId() {
        return id;
    }

    public void setId(ScorePK id) {
        this.id = id;
    }

>>>>>>> 29d6537 (Domain model, database seed)
    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
<<<<<<< HEAD
}

=======
}
>>>>>>> 29d6537 (Domain model, database seed)
