package com.gopawpaw.erp.hibernate.d;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * A data access object (DAO) providing persistence and search support for
 * DeltMstr entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see com.gopawpaw.erp.hibernate.d.DeltMstr
 * @author MyEclipse Persistence Tools
 */

public class DeltMstrDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(DeltMstrDAO.class);

	protected void initDao() {
		// do nothing
	}

	public void save(DeltMstr transientInstance) {
		log.debug("saving DeltMstr instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(DeltMstr persistentInstance) {
		log.debug("deleting DeltMstr instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public DeltMstr findById(com.gopawpaw.erp.hibernate.d.DeltMstrId id) {
		log.debug("getting DeltMstr instance with id: " + id);
		try {
			DeltMstr instance = (DeltMstr) getHibernateTemplate().get(
					"com.gopawpaw.erp.hibernate.d.DeltMstr", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(DeltMstr instance) {
		log.debug("finding DeltMstr instance by example");
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
		log.debug("finding DeltMstr instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from DeltMstr as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all DeltMstr instances");
		try {
			String queryString = "from DeltMstr";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public DeltMstr merge(DeltMstr detachedInstance) {
		log.debug("merging DeltMstr instance");
		try {
			DeltMstr result = (DeltMstr) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(DeltMstr instance) {
		log.debug("attaching dirty DeltMstr instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(DeltMstr instance) {
		log.debug("attaching clean DeltMstr instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static DeltMstrDAO getFromApplicationContext(ApplicationContext ctx) {
		return (DeltMstrDAO) ctx.getBean("DeltMstrDAO");
	}
}