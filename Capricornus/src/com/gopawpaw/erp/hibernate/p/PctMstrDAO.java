package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PctMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PctMstr
 * @author MyEclipse Persistence Tools
 */

public class PctMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PctMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PctMstr transientInstance) {
		log.debug("saving PctMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PctMstr persistentInstance) {
		log.debug("deleting PctMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PctMstr findById(com.gopawpaw.erp.hibernate.p.PctMstrId id) {
		log.debug("getting PctMstr instance with id: " + id);
		try {
			PctMstr instance = (PctMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PctMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PctMstr instance) {
		log.debug("finding PctMstr instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding PctMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PctMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PctMstr instances");
		try {
			String queryString = "from PctMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PctMstr merge(PctMstr detachedInstance) {
		log.debug("merging PctMstr instance");
		try {
			PctMstr result = (PctMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PctMstr instance) {
		log.debug("attaching dirty PctMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PctMstr instance) {
		log.debug("attaching clean PctMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PctMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PctMstrDAO) ctx.getBean("PctMstrDAO");
	}
}