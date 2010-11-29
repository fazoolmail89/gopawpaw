package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PouMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PouMstr
 * @author MyEclipse Persistence Tools
 */

public class PouMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PouMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PouMstr transientInstance) {
		log.debug("saving PouMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PouMstr persistentInstance) {
		log.debug("deleting PouMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PouMstr findById(com.gopawpaw.erp.hibernate.p.PouMstrId id) {
		log.debug("getting PouMstr instance with id: " + id);
		try {
			PouMstr instance = (PouMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PouMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PouMstr instance) {
		log.debug("finding PouMstr instance by example");
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
		log.debug("finding PouMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PouMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PouMstr instances");
		try {
			String queryString = "from PouMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PouMstr merge(PouMstr detachedInstance) {
		log.debug("merging PouMstr instance");
		try {
			PouMstr result = (PouMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PouMstr instance) {
		log.debug("attaching dirty PouMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PouMstr instance) {
		log.debug("attaching clean PouMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PouMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PouMstrDAO) ctx.getBean("PouMstrDAO");
	}
}