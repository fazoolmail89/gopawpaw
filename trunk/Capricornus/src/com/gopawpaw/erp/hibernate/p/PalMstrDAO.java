package com.gopawpaw.erp.hibernate.p;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * PalMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.p.PalMstr
 * @author MyEclipse Persistence Tools
 */

public class PalMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PalMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(PalMstr transientInstance) {
		log.debug("saving PalMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(PalMstr persistentInstance) {
		log.debug("deleting PalMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public PalMstr findById(com.gopawpaw.erp.hibernate.p.PalMstrId id) {
		log.debug("getting PalMstr instance with id: " + id);
		try {
			PalMstr instance = (PalMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.p.PalMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(PalMstr instance) {
		log.debug("finding PalMstr instance by example");
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
		log.debug("finding PalMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from PalMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all PalMstr instances");
		try {
			String queryString = "from PalMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public PalMstr merge(PalMstr detachedInstance) {
		log.debug("merging PalMstr instance");
		try {
			PalMstr result = (PalMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(PalMstr instance) {
		log.debug("attaching dirty PalMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(PalMstr instance) {
		log.debug("attaching clean PalMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PalMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PalMstrDAO) ctx.getBean("PalMstrDAO");
	}
}